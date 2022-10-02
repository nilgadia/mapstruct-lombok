package org.shahid.annotation.entity;

import org.shahid.annotations.entity.BaseDataAccess;
import org.shahid.annotations.entity.GenerateDataAccess;

import java.util.List;

/**
 * A data access interface for the Article bean.
 *
 * @author Shaikh Shahid Iqbal
 */
@GenerateDataAccess
public interface ArticleDataAccess
        extends BaseDataAccess<Article, String> {

    /**
     * A custom query that uses two parameters as search criteria.
     *
     * @param criteria1 the first search criteria
     * @param criteria2 the second search criteria
     * @return the list of beans corresponding to the given criteria
     */
    @GenerateDataAccess("select custom query clauses")
    List<Article> getByCustomCriteria(String criteria1, String criteria2);
}
