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
@Table(name = "institution_t", catalog = "")
@AttributeOverride(name = "id", column = @Column(name = "INSTITUTION_ID"))
@Data
@EqualsAndHashCode(callSuper=false)
public class InstitutionEntity extends AbstractEntity<Integer> {

    @Column(name = "INSTITUTION_CODE")
    private String institutionCode;

    @Column(name = "INSTITUTION_NAME")
    private String institutionName;

    @Column(name = "ILS_PROTOCOL")
    private String ilsProtocol;

}
