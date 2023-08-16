package org.recap.model.jpa;

import lombok.Data;
import lombok.EqualsAndHashCode;


import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * Created by pvsubrah on 6/11/16.
 */
@Entity
@Table(name = "item_status_t", catalog = "")
@AttributeOverride(name = "id", column = @Column(name = "ITEM_STATUS_ID"))
@Data
@EqualsAndHashCode(callSuper=false)
public class ItemStatusEntity extends AbstractEntity<Integer>{

    @Column(name = "STATUS_CODE")
    private String statusCode;

    @Column(name = "STATUS_DESC")
    private String statusDescription;

}
