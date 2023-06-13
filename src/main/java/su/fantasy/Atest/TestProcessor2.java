package su.fantasy.Atest;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@Component
public class TestProcessor2 implements BeanPostProcessor {

    private Map<String, Object> beanMap;

    {
        beanMap = new HashMap<>();
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        if (bean.getClass().isAnnotationPresent(MyController.class))
            beanMap.put(beanName, bean);

        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (!beanMap.containsKey(beanName))
            return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);

        Object oldBean = beanMap.get(beanName);

        return Enhancer.create(oldBean.getClass(), new MethodInterceptor() {
            @Override
            public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy1) throws Throwable {
                if (method.isAnnotationPresent(GetMapping.class)) {
                    System.out.println("Hello");
                    var res = proxy1.invoke(bean, args);
                    System.out.println("Good Bye");
                    return res;
                }
                else
                    return proxy1.invoke(bean, args);
            }
        });
    }
}
