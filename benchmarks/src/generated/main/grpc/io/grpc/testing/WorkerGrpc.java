package io.grpc.testing;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;

@javax.annotation.Generated("by gRPC proto compiler")
public class WorkerGrpc {

  // Static method descriptors that strictly reflect the proto.
  public static final io.grpc.MethodDescriptor<io.grpc.testing.ClientArgs,
      io.grpc.testing.ClientStatus> METHOD_RUN_TEST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING,
          "grpc.testing.Worker", "RunTest",
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.testing.ClientArgs.parser()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.testing.ClientStatus.parser()));
  public static final io.grpc.MethodDescriptor<io.grpc.testing.ServerArgs,
      io.grpc.testing.ServerStatus> METHOD_RUN_SERVER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING,
          "grpc.testing.Worker", "RunServer",
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.testing.ServerArgs.parser()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.testing.ServerStatus.parser()));

  public static WorkerStub newStub(io.grpc.Channel channel) {
    return new WorkerStub(channel);
  }

  public static WorkerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new WorkerBlockingStub(channel);
  }

  public static WorkerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new WorkerFutureStub(channel);
  }

  public static interface Worker {

    public io.grpc.stub.StreamObserver<io.grpc.testing.ClientArgs> runTest(
        io.grpc.stub.StreamObserver<io.grpc.testing.ClientStatus> responseObserver);

    public io.grpc.stub.StreamObserver<io.grpc.testing.ServerArgs> runServer(
        io.grpc.stub.StreamObserver<io.grpc.testing.ServerStatus> responseObserver);
  }

  public static interface WorkerBlockingClient {
  }

  public static interface WorkerFutureClient {
  }

  public static class WorkerStub extends io.grpc.stub.AbstractStub<WorkerStub>
      implements Worker {
    private WorkerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WorkerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WorkerStub(channel, callOptions);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<io.grpc.testing.ClientArgs> runTest(
        io.grpc.stub.StreamObserver<io.grpc.testing.ClientStatus> responseObserver) {
      return asyncBidiStreamingCall(
          channel.newCall(METHOD_RUN_TEST, callOptions), responseObserver);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<io.grpc.testing.ServerArgs> runServer(
        io.grpc.stub.StreamObserver<io.grpc.testing.ServerStatus> responseObserver) {
      return asyncBidiStreamingCall(
          channel.newCall(METHOD_RUN_SERVER, callOptions), responseObserver);
    }
  }

  public static class WorkerBlockingStub extends io.grpc.stub.AbstractStub<WorkerBlockingStub>
      implements WorkerBlockingClient {
    private WorkerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WorkerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WorkerBlockingStub(channel, callOptions);
    }
  }

  public static class WorkerFutureStub extends io.grpc.stub.AbstractStub<WorkerFutureStub>
      implements WorkerFutureClient {
    private WorkerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WorkerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WorkerFutureStub(channel, callOptions);
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final Worker serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder("grpc.testing.Worker")
      .addMethod(io.grpc.ServerMethodDefinition.create(
          METHOD_RUN_TEST,
          asyncBidiStreamingCall(
            new io.grpc.stub.ServerCalls.BidiStreamingMethod<
                io.grpc.testing.ClientArgs,
                io.grpc.testing.ClientStatus>() {
              @java.lang.Override
              public io.grpc.stub.StreamObserver<io.grpc.testing.ClientArgs> invoke(
                  io.grpc.stub.StreamObserver<io.grpc.testing.ClientStatus> responseObserver) {
                return serviceImpl.runTest(responseObserver);
              }
            })))
      .addMethod(io.grpc.ServerMethodDefinition.create(
          METHOD_RUN_SERVER,
          asyncBidiStreamingCall(
            new io.grpc.stub.ServerCalls.BidiStreamingMethod<
                io.grpc.testing.ServerArgs,
                io.grpc.testing.ServerStatus>() {
              @java.lang.Override
              public io.grpc.stub.StreamObserver<io.grpc.testing.ServerArgs> invoke(
                  io.grpc.stub.StreamObserver<io.grpc.testing.ServerStatus> responseObserver) {
                return serviceImpl.runServer(responseObserver);
              }
            }))).build();
  }
}
