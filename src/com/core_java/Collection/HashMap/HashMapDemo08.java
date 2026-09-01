package com.core_java.Collection.HashMap;

import java.util.HashMap;
import java.util.Map;

/*
 default V merge(K key, V value,
 BiFunction<? super V, ? super V, ? extends V> remappingFunction)
*/
public class HashMapDemo08
{
    public static void main(String[] args)
    {
        Map<String, Integer> map = new HashMap<>();

        map.merge("Apple", 10, (oldValue, newValue) -> oldValue );
        map.merge("Apple", 15, (oldValue, newValue) -> oldValue - newValue);

        map.merge("Kiwi", 25, (oldValue, newValue)-> null); // inserted

        map.merge("Orange", 50, (oldValue, newValue) -> newValue);
        map.merge("Orange", 50, (oldValue, newValue) -> null); // removed

        map.merge(null, 100, (oldValue, newValue) -> newValue);

        IO.println(map);
    }
}