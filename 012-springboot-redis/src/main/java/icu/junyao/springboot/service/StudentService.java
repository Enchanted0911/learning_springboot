package icu.junyao.springboot.service;

/**
 * @author wu
 */
public interface StudentService {

    /**
     * 放入一个键值对到redis中
     * @param key 键
     * @param value 值
     */
    void put(String key, String value);

    /**
     * 从redis中获取一个特定的值
     * @param count 表示redis的key
     * @return 返回该key的value
     */
    String get(String count);
}
