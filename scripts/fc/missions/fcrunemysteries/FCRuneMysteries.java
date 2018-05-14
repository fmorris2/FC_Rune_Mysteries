package scripts.fc.missions.fcrunemysteries;

import java.util.Arrays;
import java.util.LinkedList;

import scripts.fc.framework.quest.QuestScriptManager;
import scripts.fc.framework.requirement.Requirement;
import scripts.fc.framework.script.FCMissionScript;
import scripts.fc.framework.task.Task;
import scripts.fc.missions.fcrunemysteries.data.RMSettings;
import scripts.fc.missions.fcrunemysteries.tasks.AuburyFirstDialogue;
import scripts.fc.missions.fcrunemysteries.tasks.AuburySecondDialogue;
import scripts.fc.missions.fcrunemysteries.tasks.DukeHoracioDialogue;
import scripts.fc.missions.fcrunemysteries.tasks.SedridorFirstDialogue;
import scripts.fc.missions.fcrunemysteries.tasks.SedridorSecondDialogue;
import scripts.fc.missions.fcrunemysteries.tasks.SedridorThirdDialogue;

public class FCRuneMysteries extends QuestScriptManager
{
	public static final int SETTING = 63;
	public static final int AIR_TALISMAN = 1438, RESEARCH_PACKAGE = 290, NOTES = 291;
	
	public FCRuneMysteries(FCMissionScript fcScript)
	{
		super(fcScript);
	}

	@Override
	public boolean hasReachedEndingCondition()
	{
		return RMSettings.QUEST_FINISHED.isValid();
	}

	@Override
	public String getMissionName()
	{
		return "FC Rune Mysteries";
	}

	@Override
	public String getEndingMessage()
	{
		return "FC Rune Mysteries has ended";
	}

	@Override
	public String[] getMissionSpecificPaint()
	{
		return new String[]{};
	}

	@Override
	public void resetStatistics()
	{
	}

	@Override
	public Requirement[] getRequirements()
	{
		return new Requirement[]{};
	}

	@Override
	public LinkedList<Task> getTaskList()
	{
		return new LinkedList<>(Arrays.asList(new DukeHoracioDialogue(), new SedridorFirstDialogue(), new AuburyFirstDialogue(),
				new SedridorSecondDialogue(), new AuburySecondDialogue(), new SedridorThirdDialogue()));
	}
	
	public String toString()
	{
		return "Rune Mysteries";
	}

	@Override
	public boolean canStart()
	{
		return true;
	}

	@Override
	public int getQuestPointReward() {
		return 1;
	}

}
