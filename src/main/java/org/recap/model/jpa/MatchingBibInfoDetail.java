package org.recap.model.jpa;

import lombok.Data;
import lombok.EqualsAndHashCode;


import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * Created by premkb on 28/1/17.
 */
@Entity
@Table(name="MATCHING_BIB_INFO_DETAIL_T",schema="recap",catalog="")
@AttributeOverride(name = "id", column = @Column(name = "MATCHING_BIB_INFO_DATA_DUMP_ID"))
@Data
@EqualsAndHashCode(callSuper=false)
public class MatchingBibInfoDetail extends AbstractEntity<Integer> {
    @Column(name = "BIB_ID")
    private String bibId;

    @Column(name = "OWNING_INST_BIB_ID")
    private String owningInstitutionBibId;

    @Column(name = "OWNING_INST")
    private String owningInstitution;

    @Column(name = "LATEST_RECORD_NUM")
    private Integer recordNum;
}
