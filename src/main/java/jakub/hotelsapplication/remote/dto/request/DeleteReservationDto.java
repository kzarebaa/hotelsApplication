package jakub.hotelsapplication.remote.dto.request;

public class DeleteReservationDto {
    private Integer id;

    public DeleteReservationDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DeleteReservationDto(Integer id) {
        this.id = id;
    }
}
