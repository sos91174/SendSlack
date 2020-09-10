//import com.twilio.Twilio;
//import com.twilio.rest.api.v2010.account.Message;
//import com.twilio.type.PhoneNumber;
//
//    public class SendTwilio {
//        // Find your Account Sid and Auth Token at twilio.com/console
//        public static final String ACCOUNT_SID =
//                "********";
//        public static final String AUTH_TOKEN =
//                "c******63";
//
//        public static void main(String[] args) {
//            Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
//
//            Message message = Message
//                    .creator(new PhoneNumber("+*****"), // to
//                            new PhoneNumber("+1******"), // from
//                            "你好嗎?")
//                    .create();
//
//            System.out.println(message.getSid());
//        }
//    }
//
