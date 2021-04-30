package ShangXueTang.activeproxy.aop;

import com.example.test.entity.Person;
import com.example.test.service.IPersonService;
import com.example.test.service.PersonServiceImpl;

public class ProxyTest {

	public static void main(String[] args) {
		Person person = new Person();
		person.setName("name");
		//cglib
		IPersonService personService = (IPersonService)new CGLibProxy().createProxyObject(new PersonServiceImpl());
		System.out.println("CGLibProxy:");
		personService.insertPerson(person);
		System.out.println("JDKProxy:");
		JDKProxy jdkProxy = new JDKProxy();
		IPersonService personServiceJDK = (IPersonService)jdkProxy.newProxy(new PersonServiceImpl());
		personServiceJDK.insertPerson(person);
	}

}
