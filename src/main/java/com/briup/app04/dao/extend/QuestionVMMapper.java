package com.briup.app04.dao.extend;

import java.util.List;

import com.briup.app04.bean.Question;
import com.briup.app04.vm.QuestionVM;

public interface QuestionVMMapper {

	List<QuestionVM> findAllQuestionVM();

	void save(Question question);

	void deleteById(Long id);

	Question findById(Long id);

	void update(Question question);

}
