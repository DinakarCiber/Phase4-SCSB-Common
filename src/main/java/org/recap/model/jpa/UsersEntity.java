package org.recap.model.jpa;

import lombok.Data;
import lombok.EqualsAndHashCode;


import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;
import javax.persistence.FetchType;
import javax.persistence.JoinTable;

import java.util.Date;
import java.util.List;

/**
 * Created by dharmendrag on 29/11/16.
 */
@Data
@EqualsAndHashCode(callSuper=false)
@Entity
@Table(name="user_t",schema="recap",catalog="")
@AttributeOverride(name = "id", column = @Column(name = "user_id"))
public class UsersEntity extends AbstractEntity<Integer>{

    @Column(name="login_id")
    private String loginId;

    @Column(name="user_institution")
    private Integer institutionId;

    @Column(name="user_description")
    private String userDescription;

    @Column(name="user_emailid")
    private String emailId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATED_DATE")
    private Date createdDate;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LAST_UPDATED_DATE")
    private Date lastUpdatedDate;

    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="user_role_t", joinColumns = {
            @JoinColumn(name="user_id",referencedColumnName = "user_id")},
            inverseJoinColumns = {
                    @JoinColumn(name="role_id",referencedColumnName = "role_id")
            })
    private List<RoleEntity> userRole;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "user_institution", insertable = false, updatable = false)
    private InstitutionEntity institutionEntity;

}
