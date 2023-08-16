package org.recap.model.jpa;

import lombok.Data;
import lombok.EqualsAndHashCode;


import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.CascadeType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinTable;

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
