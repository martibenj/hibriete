package fr.polak.patate.webapp.struts.action;

public class WelcomeUserAction
{
  private String username;

  public String getUsername()
  {
    return username;
  }

  public void setUsername(String username)
  {
    this.username = username;
  }

  public String execute()
  {
    return "SUCCESS";
  }
}