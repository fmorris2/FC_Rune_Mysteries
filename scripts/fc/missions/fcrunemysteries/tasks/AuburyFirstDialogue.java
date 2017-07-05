package scripts.fc.missions.fcrunemysteries.tasks;

import scripts.fc.api.items.FCItem;
import scripts.fc.missions.fcrunemysteries.FCRuneMysteries;
import scripts.fc.missions.fcrunemysteries.data.RMSettings;

public class AuburyFirstDialogue extends AuburyDialogue
{
	private static final long serialVersionUID = -5427148649901533781L;

	@Override
	public FCItem[] getRequiredItems()
	{
		return new FCItem[]
		{
			new FCItem(1, false, FCRuneMysteries.RESEARCH_PACKAGE)
		};
	}

	@Override
	public boolean shouldExecute()
	{
		return RMSettings.AUBURY_FIRST_DIALOGUE.isValid();
	}

	@Override
	public String getStatus()
	{
		return "Aubury first dialogue";
	}

}
