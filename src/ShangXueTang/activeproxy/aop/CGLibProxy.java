package ShangXueTang.activeproxy.aop;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * CGLib代理方式
 * @since 2020-08-28
 *通过解析字节码文件（class文件），生成该类的子类，通过一个继承的方式，覆盖其中的方法，但是不能代理final修饰的类
 *优点：每个代理类不用实现接口，代理类与目标类的关系是继承关系
 *缺点：耦合性高
 */
public class CGLibProxy implements MethodInterceptor {

	//CGLib需要代理的目标对象
	private Object targetObject;
	
	public Object createProxyObject(Object object) {
		this.targetObject = object;
		/*Enhancer是一个字节码增强器，可以用来为无接口的类创建代理。
		 * 它会根据某个给定的类创建子类，并且所有非final的方法都带有回调钩子。
		 */
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(object.getClass());
		enhancer.setCallback(this);
		Object proxyObject = enhancer.create();
		return proxyObject;
	}
	
	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		Object object = null;
		//过滤方法
		if ("insertPerson".equals(arg1.getName())) {
			//检查权限
			checkPopedom();
		}
		object = arg1.invoke(targetObject, arg2);
		return object;
	}

	public void checkPopedom() {
		//进行权限检查
		System.out.println("检查权限： checkPopedom()");
	}
}
