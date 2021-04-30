package activeproxy.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class EnhancerTest {

	public static void main(String[] args) {
		//字节码增强器，为无接口的类创建代理，同时代理类与目标类为继承关系
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(Car.class);
		enhancer.setCallback(new MethodInterceptor() {

			@Override
			public Object intercept(Object paramObject, Method paramMethod, Object[] paramArrayOfObject,
					MethodProxy paramMethodProxy) throws Throwable {
				System.out.println("before");
				Object resObject = paramMethodProxy.invokeSuper(paramObject, paramArrayOfObject);
				System.out.println("after");
				return resObject;
			}
			
		});
		Car car = (Car) enhancer.create();
		
		car.print();
	}
	
	
	static class Car{
		void print() {
			System.out.println("I am a car");
		}
	}
}
