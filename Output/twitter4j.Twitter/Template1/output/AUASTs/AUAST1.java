class GeneralClass {
  void main(  String[] args){
    Twitter twitter=new TwitterFactory().getInstance();
    try {
      User user=twitter.verifyCredentials();
      List<Status> statuses=twitter.V1_SimpleName();
      V2_Name.V3_SimpleName("@" + user.getScreenName());
      for (      Status status : statuses) {
        V2_Name.V3_SimpleName(V4_StringLiteral + status.getUser().getScreenName() + " - "+ status.getText());
      }
    }
 catch (    TwitterException te) {
      te.printStackTrace();
      System.out.println("Failed to get timeline: " + te.getMessage());
      System.exit(-1);
    }
  }
}
