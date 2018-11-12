/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package alluxio.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
public class JobCommand extends org.apache.thrift.TUnion<JobCommand, JobCommand._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("JobCommand");
  private static final org.apache.thrift.protocol.TField RUN_TASK_COMMAND_FIELD_DESC = new org.apache.thrift.protocol.TField("runTaskCommand", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField CANCEL_TASK_COMMAND_FIELD_DESC = new org.apache.thrift.protocol.TField("cancelTaskCommand", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField REGISTER_COMMAND_FIELD_DESC = new org.apache.thrift.protocol.TField("registerCommand", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RUN_TASK_COMMAND((short)1, "runTaskCommand"),
    CANCEL_TASK_COMMAND((short)2, "cancelTaskCommand"),
    REGISTER_COMMAND((short)3, "registerCommand");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // RUN_TASK_COMMAND
          return RUN_TASK_COMMAND;
        case 2: // CANCEL_TASK_COMMAND
          return CANCEL_TASK_COMMAND;
        case 3: // REGISTER_COMMAND
          return REGISTER_COMMAND;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RUN_TASK_COMMAND, new org.apache.thrift.meta_data.FieldMetaData("runTaskCommand", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "RunTaskCommand")));
    tmpMap.put(_Fields.CANCEL_TASK_COMMAND, new org.apache.thrift.meta_data.FieldMetaData("cancelTaskCommand", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "CancelTaskCommand")));
    tmpMap.put(_Fields.REGISTER_COMMAND, new org.apache.thrift.meta_data.FieldMetaData("registerCommand", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "RegisterCommand")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(JobCommand.class, metaDataMap);
  }

  public JobCommand() {
    super();
  }

  public JobCommand(_Fields setField, Object value) {
    super(setField, value);
  }

  public JobCommand(JobCommand other) {
    super(other);
  }
  public JobCommand deepCopy() {
    return new JobCommand(this);
  }

  public static JobCommand runTaskCommand(RunTaskCommand value) {
    JobCommand x = new JobCommand();
    x.setRunTaskCommand(value);
    return x;
  }

  public static JobCommand cancelTaskCommand(CancelTaskCommand value) {
    JobCommand x = new JobCommand();
    x.setCancelTaskCommand(value);
    return x;
  }

  public static JobCommand registerCommand(RegisterCommand value) {
    JobCommand x = new JobCommand();
    x.setRegisterCommand(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, Object value) throws ClassCastException {
    switch (setField) {
      case RUN_TASK_COMMAND:
        if (value instanceof RunTaskCommand) {
          break;
        }
        throw new ClassCastException("Was expecting value of type RunTaskCommand for field 'runTaskCommand', but got " + value.getClass().getSimpleName());
      case CANCEL_TASK_COMMAND:
        if (value instanceof CancelTaskCommand) {
          break;
        }
        throw new ClassCastException("Was expecting value of type CancelTaskCommand for field 'cancelTaskCommand', but got " + value.getClass().getSimpleName());
      case REGISTER_COMMAND:
        if (value instanceof RegisterCommand) {
          break;
        }
        throw new ClassCastException("Was expecting value of type RegisterCommand for field 'registerCommand', but got " + value.getClass().getSimpleName());
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case RUN_TASK_COMMAND:
          if (field.type == RUN_TASK_COMMAND_FIELD_DESC.type) {
            RunTaskCommand runTaskCommand;
            runTaskCommand = new RunTaskCommand();
            runTaskCommand.read(iprot);
            return runTaskCommand;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case CANCEL_TASK_COMMAND:
          if (field.type == CANCEL_TASK_COMMAND_FIELD_DESC.type) {
            CancelTaskCommand cancelTaskCommand;
            cancelTaskCommand = new CancelTaskCommand();
            cancelTaskCommand.read(iprot);
            return cancelTaskCommand;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case REGISTER_COMMAND:
          if (field.type == REGISTER_COMMAND_FIELD_DESC.type) {
            RegisterCommand registerCommand;
            registerCommand = new RegisterCommand();
            registerCommand.read(iprot);
            return registerCommand;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        default:
          throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      return null;
    }
  }

  @Override
  protected void standardSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case RUN_TASK_COMMAND:
        RunTaskCommand runTaskCommand = (RunTaskCommand)value_;
        runTaskCommand.write(oprot);
        return;
      case CANCEL_TASK_COMMAND:
        CancelTaskCommand cancelTaskCommand = (CancelTaskCommand)value_;
        cancelTaskCommand.write(oprot);
        return;
      case REGISTER_COMMAND:
        RegisterCommand registerCommand = (RegisterCommand)value_;
        registerCommand.write(oprot);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected Object tupleSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, short fieldID) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(fieldID);
    if (setField != null) {
      switch (setField) {
        case RUN_TASK_COMMAND:
          RunTaskCommand runTaskCommand;
          runTaskCommand = new RunTaskCommand();
          runTaskCommand.read(iprot);
          return runTaskCommand;
        case CANCEL_TASK_COMMAND:
          CancelTaskCommand cancelTaskCommand;
          cancelTaskCommand = new CancelTaskCommand();
          cancelTaskCommand.read(iprot);
          return cancelTaskCommand;
        case REGISTER_COMMAND:
          RegisterCommand registerCommand;
          registerCommand = new RegisterCommand();
          registerCommand.read(iprot);
          return registerCommand;
        default:
          throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      throw new TProtocolException("Couldn't find a field with field id " + fieldID);
    }
  }

  @Override
  protected void tupleSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case RUN_TASK_COMMAND:
        RunTaskCommand runTaskCommand = (RunTaskCommand)value_;
        runTaskCommand.write(oprot);
        return;
      case CANCEL_TASK_COMMAND:
        CancelTaskCommand cancelTaskCommand = (CancelTaskCommand)value_;
        cancelTaskCommand.write(oprot);
        return;
      case REGISTER_COMMAND:
        RegisterCommand registerCommand = (RegisterCommand)value_;
        registerCommand.write(oprot);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case RUN_TASK_COMMAND:
        return RUN_TASK_COMMAND_FIELD_DESC;
      case CANCEL_TASK_COMMAND:
        return CANCEL_TASK_COMMAND_FIELD_DESC;
      case REGISTER_COMMAND:
        return REGISTER_COMMAND_FIELD_DESC;
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TStruct getStructDesc() {
    return STRUCT_DESC;
  }

  @Override
  protected _Fields enumForId(short id) {
    return _Fields.findByThriftIdOrThrow(id);
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  public RunTaskCommand getRunTaskCommand() {
    if (getSetField() == _Fields.RUN_TASK_COMMAND) {
      return (RunTaskCommand)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'runTaskCommand' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setRunTaskCommand(RunTaskCommand value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.RUN_TASK_COMMAND;
    value_ = value;
  }

  public CancelTaskCommand getCancelTaskCommand() {
    if (getSetField() == _Fields.CANCEL_TASK_COMMAND) {
      return (CancelTaskCommand)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'cancelTaskCommand' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setCancelTaskCommand(CancelTaskCommand value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.CANCEL_TASK_COMMAND;
    value_ = value;
  }

  public RegisterCommand getRegisterCommand() {
    if (getSetField() == _Fields.REGISTER_COMMAND) {
      return (RegisterCommand)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'registerCommand' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setRegisterCommand(RegisterCommand value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.REGISTER_COMMAND;
    value_ = value;
  }

  public boolean isSetRunTaskCommand() {
    return setField_ == _Fields.RUN_TASK_COMMAND;
  }


  public boolean isSetCancelTaskCommand() {
    return setField_ == _Fields.CANCEL_TASK_COMMAND;
  }


  public boolean isSetRegisterCommand() {
    return setField_ == _Fields.REGISTER_COMMAND;
  }


  public boolean equals(Object other) {
    if (other instanceof JobCommand) {
      return equals((JobCommand)other);
    } else {
      return false;
    }
  }

  public boolean equals(JobCommand other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(JobCommand other) {
    int lastComparison = org.apache.thrift.TBaseHelper.compareTo(getSetField(), other.getSetField());
    if (lastComparison == 0) {
      return org.apache.thrift.TBaseHelper.compareTo(getFieldValue(), other.getFieldValue());
    }
    return lastComparison;
  }


  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();
    list.add(this.getClass().getName());
    org.apache.thrift.TFieldIdEnum setField = getSetField();
    if (setField != null) {
      list.add(setField.getThriftFieldId());
      Object value = getFieldValue();
      if (value instanceof org.apache.thrift.TEnum) {
        list.add(((org.apache.thrift.TEnum)getFieldValue()).getValue());
      } else {
        list.add(value);
      }
    }
    return list.hashCode();
  }
  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }


  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }


}