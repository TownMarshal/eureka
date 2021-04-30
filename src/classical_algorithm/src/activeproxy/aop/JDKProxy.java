package activeproxy.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理
 * 实现InvocationHandler
 * @since 2020-08-28
 * 使用类的反射机制实现的代理方式，在调用具体的方法前使用InvocationHandler进行处理
 * 优点是：实现了接口，系统的耦合性低，利于扩展
 * 缺点是：每个目标对象都必须有一个相对应的接口
 */
public class JDKProxy implements InvocationHandler{

	//需要代理的目标对象
	private Object targetObject;
	
	//动态产生代理类，代理类必须实现了接口
	public Object newProxy(Object targetObject) {
		this.targetObject = targetObject;
		return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), 
				targetObject.getClass().getInterfaces(), this);
	}
	
	//重写invoke方法
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//进行逻辑处理函数
		checkPopedom();
		Object ret = null;
		//调用invoke方法
		ret = method.invoke(targetObject, args);
		return ret;
	}

	public void checkPopedom() {
		//进行权限检查
		System.out.println("检查权限： checkPopedom()");
	}
}
