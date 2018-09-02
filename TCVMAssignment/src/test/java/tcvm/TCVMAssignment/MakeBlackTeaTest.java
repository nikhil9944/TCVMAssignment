package tcvm.TCVMAssignment;
import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.tcvm.Makeimpl.MakeBlackTea;
import com.tcvm.controller.ContainerController;
import com.tcvm.model.Container;
import com.tcvm.serviceImpl.ProductRecord;
import com.tcvm.serviceImpl.WasteProductRecord;



@RunWith(MockitoJUnitRunner.class)
public class MakeBlackTeaTest {

	@InjectMocks
	private MakeBlackTea makeBlackTea;

	@Mock
	private ContainerController containerController;

	@Mock
	private ProductRecord productRecord;

	@Mock
	WasteProductRecord wasteproductRecord;

	@Test
	public void shouldSystemSupportToMakeBlackTea() throws IOException {

		Container container = new Container(1, 0, 0, 0, 0);

		Mockito.when(containerController.getContainerInstance()).thenReturn(container);

		makeBlackTea.makeProcess(2);

		Mockito.verify(containerController, Mockito.atLeast(1)).getContainerInstance();

	}

}
