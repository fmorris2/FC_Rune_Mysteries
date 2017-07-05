package scripts.fc.missions.fcrunemysteries.tasks;

import scripts.fc.api.items.FCItem;
import scripts.fc.missions.fcrunemysteries.data.RMSettings;

public class SedridorSecondDialogue extends SedridorDialogue
{
	private static final long serialVersionUID = -3748782454008437022L;

	@Override
	public FCItem[] getRequiredItems()
	{
		return new FCItem[]{};
	}

	@Override
	public boolean shouldExecute()
	{
		return RMSettings.SEDRIDOR_SECOND_DIALOGUE.isValid();
	}

	@Override
	public String getStatus()
	{
		return "Sedridor second dialogue";
	}

}
