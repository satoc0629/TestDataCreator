package check;

import org.junit.jupiter.api.Test;
import tdc.check.CollectionCheckUtil;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CollectionCheckUtilTest {

	@Test
	public void emptyTest01() {
		List<String> list = Arrays.asList("", "");
		assertTrue(CollectionCheckUtil.isEmpty(list));
	}

	@Test
	public void emptyTest02() {
		List<String> list = Arrays.asList("", null);
		assertTrue(CollectionCheckUtil.isEmpty(list));
	}

	@Test
	public void emptyTest03() {
		List<String> list = Arrays.asList(null, null);
		assertTrue(CollectionCheckUtil.isEmpty(list));
	}

	@Test
	public void emptyTest04() {
		List<String> list = Collections.emptyList();
		assertTrue(CollectionCheckUtil.isEmpty(list));
	}

	@Test
	public void notEmptyTest01() {
		List<String> list = Arrays.asList("a", "");
		assertTrue(CollectionCheckUtil.isNotEmpty(list));
	}
	
	@Test
	public void notEmptyTest02() {
		List<String> list = Arrays.asList(null, "a");
		assertTrue(CollectionCheckUtil.isNotEmpty(list));
	}
	
	@Test
	public void notEmptyTest03() {
		List<String> list = Arrays.asList(null, "");
		assertFalse(CollectionCheckUtil.isNotEmpty(list));
	}
	
	@Test
	public void notEmptyTest04() {
		List<String> list = Arrays.asList("a", "b");
		assertTrue(CollectionCheckUtil.isNotEmpty(list));
	}
	
	@Test
	public void notEmptyTest05() {
		List<String> list = Collections.emptyList();
		assertFalse(CollectionCheckUtil.isNotEmpty(list));
	}
	
	@Test
	public void notEmptyTest06() {
		List<String> list = null;
		assertTrue(CollectionCheckUtil.isNotEmpty(list));
	}
}
