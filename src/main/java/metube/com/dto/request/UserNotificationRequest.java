package metube.com.dto.request;


import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserNotificationRequest {
    private String description;
    private String details;
}
