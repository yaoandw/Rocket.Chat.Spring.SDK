package rocketchat.spring.ws;

import com.fasterxml.jackson.databind.JsonNode;

import java.util.Date;

/**
 * JSON Utility methods
 */
public class JsonUtils {

  public static String getText(JsonNode json, String attr) {
    return json.hasNonNull(attr) ? json.get(attr).asText() : null;
  }

  public static Date getDate(JsonNode json, String attr) {
    return json.hasNonNull(attr) ? new Date(json.get(attr).asLong()) : null;
  }

  public static String getMsg(JsonNode json) {
    return getText(json, "msg");
  }
}
