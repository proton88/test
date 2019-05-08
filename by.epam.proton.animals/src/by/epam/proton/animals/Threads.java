package by.epam.proton.animals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

public class Threads {
	// private static Logger LOGGER;
	// Label label;

	public static void main(String[] args) throws InterruptedException {
		List<Object> list = new ArrayList<Object>();
		Set<String> listString = new HashSet<String>();
		int i = 0;
//        while(true) {
//             list.add(new byte[1024]);
//             TimeUnit.NANOSECONDS.sleep(1);
//             listString.add("Default"+i++);
//        }
		// LOGGER.info("finish");
		BiMap map = HashBiMap.create();
		map.clear();
	}

	public void my() {

	}
}
