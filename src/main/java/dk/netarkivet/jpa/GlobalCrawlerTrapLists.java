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
@Table(name = "global_crawler_trap_lists", schema = "public", catalog = "netarchivesuite")
public class GlobalCrawlerTrapLists {
    private long globalCrawlerTrapListId;
    private String name;
    private String description;
    private boolean isactive;

    @Id
    @Column(name = "global_crawler_trap_list_id")
    public long getGlobalCrawlerTrapListId() {
        return globalCrawlerTrapListId;
    }

    public void setGlobalCrawlerTrapListId(long globalCrawlerTrapListId) {
        this.globalCrawlerTrapListId = globalCrawlerTrapListId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "isactive")
    public boolean isIsactive() {
        return isactive;
    }

    public void setIsactive(boolean isactive) {
        this.isactive = isactive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GlobalCrawlerTrapLists that = (GlobalCrawlerTrapLists) o;

        if (globalCrawlerTrapListId != that.globalCrawlerTrapListId) return false;
        if (isactive != that.isactive) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (globalCrawlerTrapListId ^ (globalCrawlerTrapListId >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (isactive ? 1 : 0);
        return result;
    }
}
