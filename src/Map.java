import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Potato Yao
 */

public class Map
{
 	static HashMap<String, String> map = new HashMap<>();

	static
	{
		map.put("q", "iu");
		map.put("w", "ei");
		map.put("e", "e");
		map.put("r", "uan");
		map.put("t", "ue");  // And ve
		map.put("y", "un");
		map.put("u", "u");
		map.put("i", "i");
		map.put("o", "uo");  // And o
		map.put("p", "ie");
		map.put("a", "a");
		map.put("s", "ong");  // And iong
		map.put("d", "ai");
		map.put("f", "en");
		map.put("g", "eng");
		map.put("h", "ang");
		map.put("j", "an");
		map.put("k", "uai");  // And ing
		map.put("l", "iang");  // And uang
		map.put("z", "ou");
		map.put("x", "ia");  // And ua
		map.put("c", "ao");
		map.put("v", "ui");  // And v
		map.put("b", "in");
		map.put("n", "iao");
		map.put("m", "ian");
	}

	public void test()
	{
		var random = new Random();
		var scanner = new Scanner(System.in);

		System.out.println("测试开始");


	}
}
