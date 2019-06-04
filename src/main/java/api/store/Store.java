package api.store;

import java.io.File;
import javax.xml.bind.JAXB;

@SuppressWarnings("restriction")
public class Store {
	protected final Store mall = JAXB.unmarshal(new File("src/test/resources/store.xml"), Store.class);
}
