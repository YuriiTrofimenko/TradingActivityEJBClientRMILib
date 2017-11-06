/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.tradingactivity.rmi;

import java.util.List;
import javax.ejb.Remote;
import org.tyaa.tradingactivity.entity.Sale;

/**
 *
 * @author student
 */
@Remote
public interface RMISessionBeanRemote {

    List getAllSales();
    void addSale(Sale _sale, int _brokerId, int _categoryId);
}
