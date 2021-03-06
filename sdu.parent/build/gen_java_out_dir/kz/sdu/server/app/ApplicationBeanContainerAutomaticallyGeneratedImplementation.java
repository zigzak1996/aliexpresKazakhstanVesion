package kz.sdu.server.app;
public final class ApplicationBeanContainerAutomaticallyGeneratedImplementation implements kz.sdu.server.app.ApplicationBeanContainer{

  private final java.lang.Object forSynchronizedBlocks = new java.lang.Object();

  //
  // Bean container methods
  //

  @java.lang.Override
  public kz.sdu.server.beans.AppInitializer appInitializer() {
    return getter_native_AppInitializer_18.get();
  }

  @java.lang.Override
  public kz.sdu.register.schedulers.MainScheduler getMainScheduler() {
    return getter_native_MainScheduler_17.get();
  }

  //
  // Bean creations
  //

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.email.EmailSender> cachedValue_native_EmailSender_1 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.email.EmailSender> getter_native_EmailSender_1 = this::get_native_EmailSender_1;
  private kz.greetgo.email.EmailSender get_native_EmailSender_1 () {
    {
      kz.greetgo.email.EmailSender x = cachedValue_native_EmailSender_1.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.email.EmailSender x = cachedValue_native_EmailSender_1.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.email.EmailSender localValue = getter_native_SendEmailFactory_10.get().createEmailSender();
        cachedValue_native_EmailSender_1.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.email.EmailSenderController> cachedValue_native_EmailSenderController_2 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.email.EmailSenderController> getter_native_EmailSenderController_2 = this::get_native_EmailSenderController_2;
  private kz.greetgo.email.EmailSenderController get_native_EmailSenderController_2 () {
    {
      kz.greetgo.email.EmailSenderController x = cachedValue_native_EmailSenderController_2.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.email.EmailSenderController x = cachedValue_native_EmailSenderController_2.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.email.EmailSenderController localValue = getter_native_SendEmailFactory_10.get().createEmailSenderController();
        cachedValue_native_EmailSenderController_2.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.controller.controller.EmailSendController> cachedValue_native_EmailSendController_3 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.controller.controller.EmailSendController> getter_native_EmailSendController_3 = this::get_native_EmailSendController_3;
  private kz.sdu.controller.controller.EmailSendController get_native_EmailSendController_3 () {
    {
      kz.sdu.controller.controller.EmailSendController x = cachedValue_native_EmailSendController_3.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.controller.controller.EmailSendController x = cachedValue_native_EmailSendController_3.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.controller.controller.EmailSendController localValue = new kz.sdu.controller.controller.EmailSendController();
        localValue.userRegisterBeanGetter = (kz.greetgo.depinject.core.BeanGetter<kz.sdu.controller.register.UserRegister>)(java.lang.Object)getter_native_UserRegisterImpl_15;
        cachedValue_native_EmailSendController_3.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.controller.controller.ItemController> cachedValue_native_ItemController_4 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.controller.controller.ItemController> getter_native_ItemController_4 = this::get_native_ItemController_4;
  private kz.sdu.controller.controller.ItemController get_native_ItemController_4 () {
    {
      kz.sdu.controller.controller.ItemController x = cachedValue_native_ItemController_4.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.controller.controller.ItemController x = cachedValue_native_ItemController_4.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.controller.controller.ItemController localValue = new kz.sdu.controller.controller.ItemController();
        localValue.itemRegister = (kz.greetgo.depinject.core.BeanGetter<kz.sdu.controller.register.ItemRegister>)(java.lang.Object)getter_native_ItemRegisterImpl_14;
        cachedValue_native_ItemController_4.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.controller.controller.UserController> cachedValue_native_UserController_5 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.controller.controller.UserController> getter_native_UserController_5 = this::get_native_UserController_5;
  private kz.sdu.controller.controller.UserController get_native_UserController_5 () {
    {
      kz.sdu.controller.controller.UserController x = cachedValue_native_UserController_5.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.controller.controller.UserController x = cachedValue_native_UserController_5.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.controller.controller.UserController localValue = new kz.sdu.controller.controller.UserController();
        localValue.userRegister = (kz.greetgo.depinject.core.BeanGetter<kz.sdu.controller.register.UserRegister>)(java.lang.Object)getter_native_UserRegisterImpl_15;
        cachedValue_native_UserController_5.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.register.beans.all.any_db.AllConfigFactory> cachedValue_native_AllConfigFactory_6 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.register.beans.all.any_db.AllConfigFactory> getter_native_AllConfigFactory_6 = this::get_native_AllConfigFactory_6;
  private kz.sdu.register.beans.all.any_db.AllConfigFactory get_native_AllConfigFactory_6 () {
    {
      kz.sdu.register.beans.all.any_db.AllConfigFactory x = cachedValue_native_AllConfigFactory_6.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.register.beans.all.any_db.AllConfigFactory x = cachedValue_native_AllConfigFactory_6.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.register.beans.all.any_db.AllConfigFactory localValue = new kz.sdu.register.beans.all.any_db.AllConfigFactory();
        cachedValue_native_AllConfigFactory_6.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.register.beans.all.any_db.DaoImplFactory> cachedValue_native_DaoImplFactory_7 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.register.beans.all.any_db.DaoImplFactory> getter_native_DaoImplFactory_7 = this::get_native_DaoImplFactory_7;
  private kz.sdu.register.beans.all.any_db.DaoImplFactory get_native_DaoImplFactory_7 () {
    {
      kz.sdu.register.beans.all.any_db.DaoImplFactory x = cachedValue_native_DaoImplFactory_7.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.register.beans.all.any_db.DaoImplFactory x = cachedValue_native_DaoImplFactory_7.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.register.beans.all.any_db.DaoImplFactory localValue = new kz.sdu.register.beans.all.any_db.DaoImplFactory();
        localValue.dbSessionFactory = (kz.greetgo.depinject.core.BeanGetter<kz.sdu.register.beans.all.any_db.DbSessionFactory>)(java.lang.Object)getter_native_DbSessionFactory_8;
        cachedValue_native_DaoImplFactory_7.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.register.beans.all.any_db.DbSessionFactory> cachedValue_native_DbSessionFactory_8 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.register.beans.all.any_db.DbSessionFactory> getter_native_DbSessionFactory_8 = this::get_native_DbSessionFactory_8;
  private kz.sdu.register.beans.all.any_db.DbSessionFactory get_native_DbSessionFactory_8 () {
    {
      kz.sdu.register.beans.all.any_db.DbSessionFactory x = cachedValue_native_DbSessionFactory_8.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.register.beans.all.any_db.DbSessionFactory x = cachedValue_native_DbSessionFactory_8.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.register.beans.all.any_db.DbSessionFactory localValue = new kz.sdu.register.beans.all.any_db.DbSessionFactory();
        localValue.dbConfig = (kz.greetgo.depinject.core.BeanGetter<kz.sdu.register.config.DbConfig>)(java.lang.Object)getter_native_DbConfig_11;
        localValue.afterInject();
        cachedValue_native_DbSessionFactory_8.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.register.beans.all.any_db.LiquibaseManagerImpl> cachedValue_native_LiquibaseManagerImpl_9 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.register.beans.all.any_db.LiquibaseManagerImpl> getter_native_LiquibaseManagerImpl_9 = this::get_native_LiquibaseManagerImpl_9;
  private kz.sdu.register.beans.all.any_db.LiquibaseManagerImpl get_native_LiquibaseManagerImpl_9 () {
    {
      kz.sdu.register.beans.all.any_db.LiquibaseManagerImpl x = cachedValue_native_LiquibaseManagerImpl_9.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.register.beans.all.any_db.LiquibaseManagerImpl x = cachedValue_native_LiquibaseManagerImpl_9.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.register.beans.all.any_db.LiquibaseManagerImpl localValue = new kz.sdu.register.beans.all.any_db.LiquibaseManagerImpl();
        localValue.dbConfig = (kz.greetgo.depinject.core.BeanGetter<kz.sdu.register.config.DbConfig>)(java.lang.Object)getter_native_DbConfig_11;
        cachedValue_native_LiquibaseManagerImpl_9.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.register.beans.all.any_db.SendEmailFactory> cachedValue_native_SendEmailFactory_10 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.register.beans.all.any_db.SendEmailFactory> getter_native_SendEmailFactory_10 = this::get_native_SendEmailFactory_10;
  private kz.sdu.register.beans.all.any_db.SendEmailFactory get_native_SendEmailFactory_10 () {
    {
      kz.sdu.register.beans.all.any_db.SendEmailFactory x = cachedValue_native_SendEmailFactory_10.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.register.beans.all.any_db.SendEmailFactory x = cachedValue_native_SendEmailFactory_10.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.register.beans.all.any_db.SendEmailFactory localValue = new kz.sdu.register.beans.all.any_db.SendEmailFactory();
        localValue.dbConfig = (kz.greetgo.depinject.core.BeanGetter<kz.sdu.register.config.DbConfig>)(java.lang.Object)getter_native_DbConfig_11;
        cachedValue_native_SendEmailFactory_10.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.register.config.DbConfig> cachedValue_native_DbConfig_11 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.register.config.DbConfig> getter_native_DbConfig_11 = this::get_native_DbConfig_11;
  private kz.sdu.register.config.DbConfig get_native_DbConfig_11 () {
    {
      kz.sdu.register.config.DbConfig x = cachedValue_native_DbConfig_11.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.register.config.DbConfig x = cachedValue_native_DbConfig_11.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.register.config.DbConfig localValue = getter_native_AllConfigFactory_6.get().createPostgresDbConfig();
        cachedValue_native_DbConfig_11.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.register.dao.postgres.ItemDaoPostgres> cachedValue_native_ItemDaoPostgres_12 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.register.dao.postgres.ItemDaoPostgres> getter_native_ItemDaoPostgres_12 = this::get_native_ItemDaoPostgres_12;
  private kz.sdu.register.dao.postgres.ItemDaoPostgres get_native_ItemDaoPostgres_12 () {
    {
      kz.sdu.register.dao.postgres.ItemDaoPostgres x = cachedValue_native_ItemDaoPostgres_12.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.register.dao.postgres.ItemDaoPostgres x = cachedValue_native_ItemDaoPostgres_12.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.register.dao.postgres.ItemDaoPostgres localValue = (kz.sdu.register.dao.postgres.ItemDaoPostgres) getter_native_DaoImplFactory_7.get().createBean(kz.sdu.register.dao.postgres.ItemDaoPostgres.class);
        cachedValue_native_ItemDaoPostgres_12.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.register.dao.postgres.UserDaoPostgres> cachedValue_native_UserDaoPostgres_13 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.register.dao.postgres.UserDaoPostgres> getter_native_UserDaoPostgres_13 = this::get_native_UserDaoPostgres_13;
  private kz.sdu.register.dao.postgres.UserDaoPostgres get_native_UserDaoPostgres_13 () {
    {
      kz.sdu.register.dao.postgres.UserDaoPostgres x = cachedValue_native_UserDaoPostgres_13.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.register.dao.postgres.UserDaoPostgres x = cachedValue_native_UserDaoPostgres_13.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.register.dao.postgres.UserDaoPostgres localValue = (kz.sdu.register.dao.postgres.UserDaoPostgres) getter_native_DaoImplFactory_7.get().createBean(kz.sdu.register.dao.postgres.UserDaoPostgres.class);
        cachedValue_native_UserDaoPostgres_13.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.register.impl.ItemRegisterImpl> cachedValue_native_ItemRegisterImpl_14 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.register.impl.ItemRegisterImpl> getter_native_ItemRegisterImpl_14 = this::get_native_ItemRegisterImpl_14;
  private kz.sdu.register.impl.ItemRegisterImpl get_native_ItemRegisterImpl_14 () {
    {
      kz.sdu.register.impl.ItemRegisterImpl x = cachedValue_native_ItemRegisterImpl_14.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.register.impl.ItemRegisterImpl x = cachedValue_native_ItemRegisterImpl_14.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.register.impl.ItemRegisterImpl localValue = new kz.sdu.register.impl.ItemRegisterImpl();
        localValue.itemDaoBeanGetter = (kz.greetgo.depinject.core.BeanGetter<kz.sdu.register.dao.ItemDao>)(java.lang.Object)getter_native_ItemDaoPostgres_12;
        localValue.userDaoBeanGetter = (kz.greetgo.depinject.core.BeanGetter<kz.sdu.register.dao.UserDao>)(java.lang.Object)getter_native_UserDaoPostgres_13;
        cachedValue_native_ItemRegisterImpl_14.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.register.impl.UserRegisterImpl> cachedValue_native_UserRegisterImpl_15 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.register.impl.UserRegisterImpl> getter_native_UserRegisterImpl_15 = this::get_native_UserRegisterImpl_15;
  private kz.sdu.register.impl.UserRegisterImpl get_native_UserRegisterImpl_15 () {
    {
      kz.sdu.register.impl.UserRegisterImpl x = cachedValue_native_UserRegisterImpl_15.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.register.impl.UserRegisterImpl x = cachedValue_native_UserRegisterImpl_15.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.register.impl.UserRegisterImpl localValue = new kz.sdu.register.impl.UserRegisterImpl();
        localValue.emailSender = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.email.EmailSender>)(java.lang.Object)getter_native_EmailSender_1;
        localValue.emailSenderController = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.email.EmailSenderController>)(java.lang.Object)getter_native_EmailSenderController_2;
        localValue.userDaoBeanGetter = (kz.greetgo.depinject.core.BeanGetter<kz.sdu.register.dao.UserDao>)(java.lang.Object)getter_native_UserDaoPostgres_13;
        cachedValue_native_UserRegisterImpl_15.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.register.schedulers.ExampleScheduler> cachedValue_native_ExampleScheduler_16 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.register.schedulers.ExampleScheduler> getter_native_ExampleScheduler_16 = this::get_native_ExampleScheduler_16;
  private kz.sdu.register.schedulers.ExampleScheduler get_native_ExampleScheduler_16 () {
    {
      kz.sdu.register.schedulers.ExampleScheduler x = cachedValue_native_ExampleScheduler_16.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.register.schedulers.ExampleScheduler x = cachedValue_native_ExampleScheduler_16.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.register.schedulers.ExampleScheduler localValue = new kz.sdu.register.schedulers.ExampleScheduler();
        localValue.emailSenderControllerBeanGetter = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.email.EmailSenderController>)(java.lang.Object)getter_native_EmailSenderController_2;
        cachedValue_native_ExampleScheduler_16.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.register.schedulers.MainScheduler> cachedValue_native_MainScheduler_17 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.register.schedulers.MainScheduler> getter_native_MainScheduler_17 = this::get_native_MainScheduler_17;
  private kz.sdu.register.schedulers.MainScheduler get_native_MainScheduler_17 () {
    {
      kz.sdu.register.schedulers.MainScheduler x = cachedValue_native_MainScheduler_17.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.register.schedulers.MainScheduler x = cachedValue_native_MainScheduler_17.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.register.schedulers.MainScheduler localValue = new kz.sdu.register.schedulers.MainScheduler();
        localValue.scheduleBeanList = (kz.greetgo.depinject.core.BeanGetter<java.util.List<kz.greetgo.scheduling.HasScheduled>>)(java.lang.Object)getter_ref_list_HasScheduled_22;
        cachedValue_native_MainScheduler_17.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.server.beans.AppInitializer> cachedValue_native_AppInitializer_18 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.server.beans.AppInitializer> getter_native_AppInitializer_18 = this::get_native_AppInitializer_18;
  private kz.sdu.server.beans.AppInitializer get_native_AppInitializer_18 () {
    {
      kz.sdu.server.beans.AppInitializer x = cachedValue_native_AppInitializer_18.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.server.beans.AppInitializer x = cachedValue_native_AppInitializer_18.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.server.beans.AppInitializer localValue = new kz.sdu.server.beans.AppInitializer();
        localValue.controllerServlet = (kz.greetgo.depinject.core.BeanGetter<kz.sdu.server.beans.ControllerServlet>)(java.lang.Object)getter_native_ControllerServlet_19;
        localValue.liquibaseManager = (kz.greetgo.depinject.core.BeanGetter<kz.sdu.register.util.LiquibaseManager>)(java.lang.Object)getter_native_LiquibaseManagerImpl_9;
        localValue.utf8AndTraceResetFilter = (kz.greetgo.depinject.core.BeanGetter<kz.sdu.server.beans.Utf8AndTraceResetFilter>)(java.lang.Object)getter_native_Utf8AndTraceResetFilter_20;
        cachedValue_native_AppInitializer_18.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.server.beans.ControllerServlet> cachedValue_native_ControllerServlet_19 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.server.beans.ControllerServlet> getter_native_ControllerServlet_19 = this::get_native_ControllerServlet_19;
  private kz.sdu.server.beans.ControllerServlet get_native_ControllerServlet_19 () {
    {
      kz.sdu.server.beans.ControllerServlet x = cachedValue_native_ControllerServlet_19.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.server.beans.ControllerServlet x = cachedValue_native_ControllerServlet_19.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.server.beans.ControllerServlet localValue = new kz.sdu.server.beans.ControllerServlet();
        localValue.controllerList = (kz.greetgo.depinject.core.BeanGetter<java.util.List<kz.sdu.controller.utils.Controller>>)(java.lang.Object)getter_ref_list_Controller_23;
        localValue.views = (kz.greetgo.depinject.core.BeanGetter<kz.greetgo.mvc.interfaces.Views>)(java.lang.Object)getter_native_WarEducationViews_21;
        cachedValue_native_ControllerServlet_19.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.server.beans.Utf8AndTraceResetFilter> cachedValue_native_Utf8AndTraceResetFilter_20 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.server.beans.Utf8AndTraceResetFilter> getter_native_Utf8AndTraceResetFilter_20 = this::get_native_Utf8AndTraceResetFilter_20;
  private kz.sdu.server.beans.Utf8AndTraceResetFilter get_native_Utf8AndTraceResetFilter_20 () {
    {
      kz.sdu.server.beans.Utf8AndTraceResetFilter x = cachedValue_native_Utf8AndTraceResetFilter_20.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.server.beans.Utf8AndTraceResetFilter x = cachedValue_native_Utf8AndTraceResetFilter_20.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.server.beans.Utf8AndTraceResetFilter localValue = new kz.sdu.server.beans.Utf8AndTraceResetFilter();
        cachedValue_native_Utf8AndTraceResetFilter_20.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.sdu.server.beans.WarEducationViews> cachedValue_native_WarEducationViews_21 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.sdu.server.beans.WarEducationViews> getter_native_WarEducationViews_21 = this::get_native_WarEducationViews_21;
  private kz.sdu.server.beans.WarEducationViews get_native_WarEducationViews_21 () {
    {
      kz.sdu.server.beans.WarEducationViews x = cachedValue_native_WarEducationViews_21.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.sdu.server.beans.WarEducationViews x = cachedValue_native_WarEducationViews_21.get();
        if (x != null) return x;
      }
      try {
        kz.sdu.server.beans.WarEducationViews localValue = new kz.sdu.server.beans.WarEducationViews();
        cachedValue_native_WarEducationViews_21.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  //
  // Bean references
  //

  private final kz.greetgo.depinject.core.BeanGetter<java.util.List<kz.greetgo.scheduling.HasScheduled>> getter_ref_list_HasScheduled_22 = this::get_ref_list_HasScheduled_22;
  private java.util.List<kz.greetgo.scheduling.HasScheduled> get_ref_list_HasScheduled_22() {
    java.util.List<kz.greetgo.scheduling.HasScheduled> list = new java.util.ArrayList<>();
    list.add(getter_native_ExampleScheduler_16.get());
    return list;
  }

  private final kz.greetgo.depinject.core.BeanGetter<java.util.List<kz.sdu.controller.utils.Controller>> getter_ref_list_Controller_23 = this::get_ref_list_Controller_23;
  private java.util.List<kz.sdu.controller.utils.Controller> get_ref_list_Controller_23() {
    java.util.List<kz.sdu.controller.utils.Controller> list = new java.util.ArrayList<>();
    list.add(getter_native_EmailSendController_3.get());
    list.add(getter_native_ItemController_4.get());
    list.add(getter_native_UserController_5.get());
    return list;
  }
  
  //
  // Getter creations
  //
}
