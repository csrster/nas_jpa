package dk.netarkivet.jpa;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by csr on 9/2/14.
 */
@Entity
@Table(name = "global_crawler_trap_expressions", schema = "public", catalog = "netarchivesuite")
public class GlobalCrawlerTrapExpressions {
    private long id;
    private long crawlerTrapListId;
    private String trapExpression;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "crawler_trap_list_id")
    public long getCrawlerTrapListId() {
        return crawlerTrapListId;
    }

    public void setCrawlerTrapListId(long crawlerTrapListId) {
        this.crawlerTrapListId = crawlerTrapListId;
    }

    @Basic
    @Column(name = "trap_expression")
    public String getTrapExpression() {
        return trapExpression;
    }

    public void setTrapExpression(String trapExpression) {
        this.trapExpression = trapExpression;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GlobalCrawlerTrapExpressions that = (GlobalCrawlerTrapExpressions) o;

        if (crawlerTrapListId != that.crawlerTrapListId) return false;
        if (id != that.id) return false;
        if (trapExpression != null ? !trapExpression.equals(that.trapExpression) : that.trapExpression != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (crawlerTrapListId ^ (crawlerTrapListId >>> 32));
        result = 31 * result + (trapExpression != null ? trapExpression.hashCode() : 0);
        return result;
    }
}
