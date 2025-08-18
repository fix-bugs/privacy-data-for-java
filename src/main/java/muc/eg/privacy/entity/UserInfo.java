package muc.eg.privacy.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import muc.eg.privacy.sensitive.serializer.DefaultSensitiveSerializer;
import muc.eg.privacy.sensitive.serializer.MobileSensitiveSerializer;

@Data
public class UserInfo {

    private String id;
    @JsonSerialize(using = DefaultSensitiveSerializer.class)
    private String name;
    @JsonSerialize(using = MobileSensitiveSerializer.class)
    private String mobile;
    private String email;
    private String idCard;
    private String registerTime;
}
