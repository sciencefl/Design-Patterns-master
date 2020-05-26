package collectionTest;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @Classname CollectionTest
 * @Description TODO
 * @Date 2020/5/25 16:41
 * @Created by flzhang
 */
public class CollectionTest {
    private  String name;
    private  String age;
    public static void main(String[] args) {
        HashMap map =new HashMap();
        map.put("s01","张三");
        map.put("s02","里斯");
        map.put("s03","王五");
        System.out.println(map);
        Object v= map.get("s01");
        System.out.println(v);
        System.out.println(map.containsKey("s02"));
        //讲map转化为单值集合
        Set set=map.keySet();
        Collection values = map.values();
        for (Object o:set){
            System.out.println(o);
            Object v2= map.get(o); // 通过key获取v
        }
        Iterator iter =values.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        Set set3 = map.entrySet();
        //遍历map：将双值变单值
        for(Object o:set3){
            Map.Entry et =(Map.Entry)o;
            Object key=et.getKey();
            Object value=et.getValue();
        }
        List<String> list=new ArrayList<>();
        list.add("a1");
        list.add("a4");
        list.add("a3");
        list.add("a6");
        Collections.sort(list);
        System.out.println(list);
        System.out.println(Collections.binarySearch(list,"a4"));
        Collections.replaceAll(list,"a4","A");
        System.out.println(list);
        Comparator

    }
}
