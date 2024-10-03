package com.app.FundFlowBE.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.FundFlowBE.model.Stage;
import com.app.FundFlowBE.model.Startup;
import com.app.FundFlowBE.model.FundingRound;
import com.app.FundFlowBE.model.Founder;
import com.app.FundFlowBE.model.Document;
import com.app.FundFlowBE.model.Investor;
import com.app.FundFlowBE.enums.RoundStatus;
import com.app.FundFlowBE.enums.StageName;
import com.app.FundFlowBE.converter.StageNameConverter;
import com.app.FundFlowBE.converter.RoundStatusConverter;

@Entity(name = "StartupPreviousRounds")
@Table(schema = "\"fundflowbe_352\"", name = "\"StartupPreviousRounds\"")
@Data
public class StartupPreviousRounds{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"SId\"")
	private Integer sId;

    
    @Column(name = "\"RoundId\"")
    private Integer roundId;
 
}