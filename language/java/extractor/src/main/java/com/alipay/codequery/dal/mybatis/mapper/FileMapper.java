package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.FileDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.File;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface FileMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file")
    BasicColumn[] selectList = BasicColumn.columnList(elementHashId, qualifiedName, extension, name, numberOfLinesHashId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<File> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<File> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="qualified_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="extension", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="number_of_lines_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<File> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="qualified_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="extension", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="number_of_lines_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<File> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, file, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, file, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file")
    default int insert(File record) {
        return MyBatis3Utils.insert(this::insert, record, file, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(qualifiedName).toProperty("qualifiedName")
            .map(extension).toProperty("extension")
            .map(name).toProperty("name")
            .map(numberOfLinesHashId).toProperty("numberOfLinesHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file")
    default int insertMultiple(Collection<File> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, file, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(qualifiedName).toProperty("qualifiedName")
            .map(extension).toProperty("extension")
            .map(name).toProperty("name")
            .map(numberOfLinesHashId).toProperty("numberOfLinesHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file")
    default int insertSelective(File record) {
        return MyBatis3Utils.insert(this::insert, record, file, c ->
            c.map(elementHashId).toPropertyWhenPresent("elementHashId", record::getElementHashId)
            .map(qualifiedName).toPropertyWhenPresent("qualifiedName", record::getQualifiedName)
            .map(extension).toPropertyWhenPresent("extension", record::getExtension)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(numberOfLinesHashId).toPropertyWhenPresent("numberOfLinesHashId", record::getNumberOfLinesHashId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file")
    default Optional<File> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, file, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file")
    default List<File> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, file, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file")
    default List<File> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, file, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, file, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file")
    static UpdateDSL<UpdateModel> updateAllColumns(File record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalTo(record::getElementHashId)
                .set(qualifiedName).equalTo(record::getQualifiedName)
                .set(extension).equalTo(record::getExtension)
                .set(name).equalTo(record::getName)
                .set(numberOfLinesHashId).equalTo(record::getNumberOfLinesHashId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(File record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalToWhenPresent(record::getElementHashId)
                .set(qualifiedName).equalToWhenPresent(record::getQualifiedName)
                .set(extension).equalToWhenPresent(record::getExtension)
                .set(name).equalToWhenPresent(record::getName)
                .set(numberOfLinesHashId).equalToWhenPresent(record::getNumberOfLinesHashId);
    }
}