package std.sbb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import std.sbb.article.ArticleRepository;
import std.sbb.article.ArticleService;

@SpringBootTest
class SbbApplicationTests {

	@Autowired
	private ArticleRepository questionRepository;
	private ArticleService articleService;

	@Test
	void testJpa() {
		for (int i = 1; i <= 300; i++) {
			String subject = String.format("테스트 데이터입니다:");
			String content = "내용무";
			this.articleService.create(subject, content, null);
		}
	}
}

