package in.co.rays.project_3.model;

import java.util.List;

import in.co.rays.project_3.dto.CustomersDTO;
import in.co.rays.project_3.exception.ApplicationException;
import in.co.rays.project_3.exception.DuplicateRecordException;
import in.co.rays.project_3.exception.RecordNotFoundException;

/**
 * Interface of CustomersDTO model
 * @author pooja jawariya
 *
 */
public interface CustomersModelInt {
public long add(CustomersDTO dto)throws ApplicationException,DuplicateRecordException;
public void delete(CustomersDTO dto)throws ApplicationException;
public void update(CustomersDTO dto)throws ApplicationException,DuplicateRecordException;
public CustomersDTO findByPK(long pk)throws ApplicationException;
public CustomersDTO findByLogin(String login)throws ApplicationException;
public List list()throws ApplicationException;
public List list(int pageNo,int pageSize)throws ApplicationException;
public List search(CustomersDTO dto,int pageNo,int pageSize)throws ApplicationException;
public List search(CustomersDTO dto)throws ApplicationException;
public boolean changePassword(long id,String newPassword,String oldPassword)throws ApplicationException, RecordNotFoundException;
public CustomersDTO authenticate(String login,String password)throws ApplicationException;
public boolean forgetPassword(String login)throws ApplicationException, RecordNotFoundException;
public boolean resetPassword(CustomersDTO dto)throws ApplicationException,RecordNotFoundException;
public long registerUser(CustomersDTO dto)throws ApplicationException,DuplicateRecordException;
public List getRoles(CustomersDTO dto)throws ApplicationException;

}
