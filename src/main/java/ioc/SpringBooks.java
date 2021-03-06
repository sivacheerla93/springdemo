package ioc;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "spring")
// @Primary
// @Scope(scopeName = "prototype")
// @Scope(scopeName = "singleton")
public class SpringBooks implements Books {

	public SpringBooks() {
		System.out.println("SpringBooks()");
	}

	@Override
	public List<String> getBooks() {
		ArrayList<String> books = new ArrayList<>();
		books.add("Spring in Action");
		books.add("Spring Data");
		return books;
	}
}