package cn.myself.platform.common.mongodb;

import cn.myself.platform.common.utils.StringHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.mongodb.core.CollectionOptions;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import java.nio.charset.Charset;
import java.util.List;

/**
 * @author 【name】毛攀攀
 * @author 【date】2018/01/26
 * @author 【时间】17:33
 * @author 【说明】
 * @author 【工程】springboot-platform-master
 * @author 【目录】cn.myself.platform.common.mongodb
 */
public class MongodbRepository<T> {

    private Logger LOGGER = LoggerFactory.getLogger(MongodbRepository.class);

    /**
     * 默认编码
     */
    private static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");

    private MongoTemplate mongoTemplate;

    public MongodbRepository(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    //调用过程中，需要明确指定集合名称

    /**
     * 检查集合是否存在
     *
     * @param collectionName
     * @return
     */
    public boolean checkCollectionExists(String collectionName) {
        if (StringHelper.isEmpty(collectionName)) return false;
        return mongoTemplate.collectionExists(collectionName);
    }

    /**
     * 创建mongo集合
     *
     * @param collectionName
     */
    public void createCollection(String collectionName) {
        mongoTemplate.createCollection(collectionName);
    }

    /**
     * 添加集合数据
     *
     * @param object         添加对象
     * @param collectionName 集合名称
     */
    public void insert(Object object, String collectionName) {
        mongoTemplate.insert(object, collectionName);
    }

    /**
     * 批量插入
     *
     * @param objects        对象集合
     * @param collectionName 集合名称
     */
    public void insert(List<Object> objects, String collectionName) {
        mongoTemplate.insert(objects, collectionName);
    }


    /**
     * 删除集合数据
     *
     * @param query          查询语句
     * @param collectionName 集合名称
     */
    public void delete(Query query, String collectionName) {
        mongoTemplate.remove(query, collectionName);
    }

    /**
     * 更新集合数据
     *
     * @param query
     * @param update
     * @param collectionName
     */
    public void update(Query query, Update update, String collectionName) {
        mongoTemplate.upsert(query, update, collectionName);
    }


    /**
     * 查询集合中一条数据
     *
     * @param query
     * @param clazz
     * @param collectionName
     * @return
     */
    public Object selectOne(Query query, Class clazz, String collectionName) {
        return mongoTemplate.findOne(query, clazz, collectionName);
    }

    /**
     * 查询集合多条数据
     *
     * @param query
     * @param clazz
     * @param collectionName
     * @return
     */
    public List<Object> select(Query query, Class clazz, String collectionName) {
        return mongoTemplate.find(query, clazz, collectionName);
    }

    /**
     * 查询集合中满足条件数据条数
     *
     * @param query
     * @param collectionName
     * @return
     */
    public long count(Query query, String collectionName) {
        return mongoTemplate.count(query, collectionName);
    }


    /**
     * 检查集合是否存在
     *
     * @param clazz 存储类
     * @return
     */
    public boolean checkCollectionExists(Class clazz) {
        if (StringHelper.isEmpty(clazz)) return false;
        return mongoTemplate.collectionExists(clazz);
    }

    /**
     * 创建mongo集合
     *
     * @param clazz 存储类
     */
    public void createCollection(Class clazz) {
        mongoTemplate.createCollection(clazz);
    }

    /**
     * 添加集合数据
     *
     * @param object 添加对象
     */
    public void insert(Object object) {
        mongoTemplate.insert(object);
    }

    /**
     * 批量插入
     *
     * @param objects 对象集合
     */
    public void insert(List<Object> objects) {
        mongoTemplate.insert(objects);
    }


    /**
     * 删除集合数据
     *
     * @param query 查询语句
     */
    public void delete(Query query) {
        mongoTemplate.remove(query);
    }

    /**
     * 更新集合数据
     *
     * @param query
     * @param update
     * @param clazz
     */
    public void update(Query query, Update update, Class clazz) {
        mongoTemplate.upsert(query, update, clazz);
    }


    /**
     * 查询集合中一条数据
     *
     * @param query
     * @param clazz
     * @return
     */
    public Object selectOne(Query query, Class clazz) {
        return mongoTemplate.findOne(query, clazz);
    }

    /**
     * 查询集合多条数据
     *
     * @param query
     * @param clazz
     * @return
     */
    public List<Object> select(Query query, Class clazz) {
        return mongoTemplate.find(query, clazz);
    }

    /**
     * 查询集合中满足条件数据条数
     *
     * @param query
     * @param clazz
     * @return
     */
    public long count(Query query, Class clazz) {
        return mongoTemplate.count(query, clazz);
    }


}
