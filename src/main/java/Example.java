import com.slack.api.Slack;
import com.slack.api.methods.MethodsClient;
import com.slack.api.methods.SlackApiException;
import com.slack.api.methods.request.chat.ChatPostMessageRequest;
import com.slack.api.methods.response.api.ApiTestResponse;
import com.slack.api.methods.response.chat.ChatPostMessageResponse;
import com.slack.api.model.Message;
import com.slack.api.webhook.Payload;
import com.slack.api.webhook.WebhookResponse;
import java.io.IOException;


public class Example {

    public static void main(String[] args) throws Exception {

        String channelId = "#random";
        String text = ":wave: Hi from a bot written in Java!";

        Slack slack = Slack.getInstance();
        String token = System.getenv("https://hooks.slack.com/services/***********/*******");

        ChatPostMessageResponse response = slack.methods(token).chatPostMessage(req -> req
                .channel(channelId)
                .text(text)
        );


            System.out.println(response);



//        Slack slack = Slack.getInstance();
//        String token = System.getenv("https://hooks.slack.com/services/*********/********");
//
////        ChatPostMessageResponse response = slack.methods(token).chatPostMessage(req -> req
////                .channel("#test")
////                .text(":wave: Hi from a bot written in Java!"));
//        try {
//            ChatPostMessageResponse response = slack.methods(token).chatPostMessage(req -> req
//                    .channel("#test")
//                    .text("Write one, post anywhere"));
//            if (response.isOk()) {
//                Message postedMessage = response.getMessage();
//            } else {
//                String errorCode = response.getError(); // e.g., "invalid_auth", "channel_not_found"
//            }
//        } catch (SlackApiException requestFailure) {
//            // Slack API responded with unsuccessful status code (= not 20x)
//        } catch (IOException connectivityIssue) {
//            // Throwing this exception indicates your app or Slack servers had a connectivity issue.
//        }

   }
}
