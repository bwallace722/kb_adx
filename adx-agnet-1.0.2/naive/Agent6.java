package naive;

import java.util.HashMap;
import java.util.Random;

import naive.ReasonableBot.CampaignData;
import tau.tac.adx.props.AdxBidBundle;


public class Agent6 extends ReasonableBot {

	@Override
	protected void simulationSetup() {
		agentName = "6";
		qualityRatingProtection = true;
		randomGenerator = new Random();
		persistantCampaignBid = .1 + 0.01 * randomGenerator.nextDouble();
		day = 0;
		bidBundle = new AdxBidBundle();
		ucsTargetLevel = .8;

		myCampaigns = new HashMap<Integer, CampaignData>();
		//	log.fine("AdNet " + getName() + " simulationSetup");
	}
}
