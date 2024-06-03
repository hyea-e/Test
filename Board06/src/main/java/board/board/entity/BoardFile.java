package board.board.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Table(name = 'table_file')
@Entity
@Data
public class BoardFile {
	
	private int idx;
	
	private int boardIdx;
	
	private String originalFileName;
	
	private String storedFilePath;
	
	private long fileSize;

	//추가 코드
	private String creatorId;
	private LocalDateTime createDatetime;
	private String updatorId;
	private LocalDateTime updatedDatetime;

	@Column(columnDefinition = "varchar(2) default 'N'")
	private String deletedYn;
}
