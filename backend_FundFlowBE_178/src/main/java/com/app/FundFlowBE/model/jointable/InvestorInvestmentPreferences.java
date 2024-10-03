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

@Entity(name = "InvestorInvestmentPreferences")
@Table(schema = "\"fundflowbe_352\"", name = "\"InvestorInvestmentPreferences\"")
@Data
public class InvestorInvestmentPreferences{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"InvestorId\"")
	private Integer investorId;

    
    @Column(name = "\"InvestmentPreferences\"")
    private Integer investmentPreferences;
}