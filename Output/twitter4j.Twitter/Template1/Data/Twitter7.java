class Twitter7 {
  /**
 * Usage: java twitter4j.examples.timeline.GetRetweetedToMe
 * @param args String[]
 */
  public static void main(  String[] args){
    Twitter twitter=new TwitterFactory().getInstance();
    try {
      User user=twitter.verifyCredentials();
      List<Status> statuses=twitter.getRetweetedToMe();
      System.out.println("@" + user.getScreenName());
      for (      Status status : statuses) {
        System.out.println("Retweeted to me by @" + status.getUser().getScreenName() + " - "+ status.getText());
      }
    }
 catch (    TwitterException te) {
      te.printStackTrace();
      System.out.println("Failed to get timeline: " + te.getMessage());
      System.exit(-1);
    }
  }
}
