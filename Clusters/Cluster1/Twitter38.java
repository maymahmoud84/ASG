class Twitter38 {
  /**
 * Usage: java twitter4j.examples.timeline.GetMentions
 * @param args String[]
 */
  public static void main(  String[] args){
    Twitter twitter=new TwitterFactory().getInstance();
    try {
      User user=twitter.verifyCredentials();
      List<Status> statuses=twitter.getRetweetedByMe();
      output.print("@" + user.getScreenName());
      for (      Status status : statuses) {
        output.print("Retweeted by Me @" + status.getUser().getScreenName() + " - "+ status.getText());
      }
    }
 catch (    TwitterException te) {
      te.printStackTrace();
      System.out.println("Failed to get timeline: " + te.getMessage());
      System.exit(-1);
    }
  }
}
