package board.board.entity;

import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Data
@Entity
@Table(name = "table_board")
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int boardIdx;

    private String title;

    private String contents;

    @ColumnDefault("8")
    private int hitCnt;

    private String creatorId;

    private String createdDatetime;

    private String updaterId;

    @Column(columnDefinition = "varchar(2) default 'N'")
    private String updatedDatetime;
}
