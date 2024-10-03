package com.app.FundFlowBE.function;

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
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.FundFlowBE.repository.FundingRoundRepository;
import com.app.FundFlowBE.repository.StageRepository;
import com.app.FundFlowBE.repository.DocumentRepository;
import com.app.FundFlowBE.repository.InvestorRepository;
import com.app.FundFlowBE.repository.FounderRepository;
import com.app.FundFlowBE.repository.StartupRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
