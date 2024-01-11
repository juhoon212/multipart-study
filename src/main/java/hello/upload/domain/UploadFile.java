package hello.upload.domain;

import lombok.Data;

@Data
public class UploadFile {

    // 고객이 제출한 파일명
    private String uploadFileName;
    // 저장되있는 파일명
    private String storeFileName;

    public UploadFile(String originalFilename, String storeFileName) {
        this.uploadFileName = originalFilename;
        this.storeFileName = storeFileName;
    }
}
