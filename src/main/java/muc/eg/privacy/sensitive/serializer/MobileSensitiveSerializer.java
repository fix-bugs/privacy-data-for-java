package muc.eg.privacy.sensitive.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import muc.eg.privacy.sensitive.SensitiveUtil;

import java.io.IOException;

/**
 * 手机号脱敏
 */
public class MobileSensitiveSerializer extends JsonSerializer<String> {
    @Override
    public void serialize(String s, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(SensitiveUtil.replaceMobile(s));
    }
}