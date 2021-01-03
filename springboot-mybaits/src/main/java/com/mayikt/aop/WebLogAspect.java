package com.mayikt.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * 定义一个切面拦截包
 */
@Aspect
@Component
@Slf4j
public class WebLogAspect {
    /**
     *切入点* com.mayikt.service包下的所有的类
     * 第一个“.*”该包下的所以后的类
     * 第二个“.*”该类下的所有的方法
     * 第三个“(..)”该类下所有方法的参数
     */
    @Pointcut("execution(public * com.mayikt.service.*.*(..))")
    public void webLog(){

    }

    //前置通知
    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint)throws Throwable{
        //接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        //记录下请求内容
        log.info("URL："+request.getRequestURL().toString());
        log.info("HTTP_METHOD："+request.getMethod());
        log.info("IP："+request.getRemoteAddr());
        /**
         * Enumeration（枚举）接口的作用和Iterator类似，只提供了遍历Vector和HashTable类型集合元素的功能，
         * 不支持元素的移除操作。
         * boolean hasMoreElements();//判断是否包含元素
         * E nextElement();//获得下一个元素
         */
        /**request.getParameterNames()方法是:
         * 将发送请求页面中form表单里所有具有name属性的表单对象获取(包括button).
         * 返回一个Enumeration类型的枚举.
         * 通过Enumeration的hasMoreElements()方法遍历.
         * 再由nextElement()方法获得枚举的值.
         * 此时的值是form表单中所有控件的name属性的值.
         */
        //request.getParameterNames获得请求参数的名字(Get或者Post请求的参数都可以)
        Enumeration<String> enumeration = request.getParameterNames();
        while (enumeration.hasMoreElements()){
            String name = enumeration.nextElement();
            //HttpServletRequest的getParameter("username")方法是取出username的值
            log.info("name:{},value:{}",name,request.getParameter(name));
        }
    }

    //后置通知:目标方法请求之后，打印（响应）信息
    @AfterReturning(returning = "ret",pointcut = "webLog()")
    public void doAfterReturning(Object ret) throws Throwable{
        //处理完请求，返回内容
        log.info("RESPONSE:"+ret);
    }
}
