package tcvm.TCVMAssignment;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.tcvm.model.Container;
import com.tcvm.serviceImpl.WasteProductRecord;
@RunWith(MockitoJUnitRunner.class)
public class WasteProductRecordTest {

	@InjectMocks
	private WasteProductRecord wasteProductRecord;

	@Mock
	private List<Container> wasteProductList ;
	
	
	@Test
	public void testaddWasteProductInList(){
		// Container container = new Container(1, 0 , 0 ,0, 0);
		//Mockito.verify(wasteProductRecord);
	}

}
